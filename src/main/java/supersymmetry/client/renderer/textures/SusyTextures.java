package supersymmetry.client.renderer.textures;

import gregtech.api.gui.resources.SteamTexture;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleSidedCubeRenderer;

import static gregtech.client.renderer.texture.cube.OrientedOverlayRenderer.OverlayFace.FRONT;

public class SusyTextures {

    public static final SimpleSidedCubeRenderer WOODEN_COAGULATION_TANK_WALL = new SimpleSidedCubeRenderer("casings/wooden_coagulation_tank_wall");
    public static final OrientedOverlayRenderer VULCANIZING_PRESS_OVERLAY = new OrientedOverlayRenderer("machines/vulcanizing_press", new OrientedOverlayRenderer.OverlayFace[]{FRONT, OrientedOverlayRenderer.OverlayFace.SIDE, OrientedOverlayRenderer.OverlayFace.TOP});
    public static final OrientedOverlayRenderer LATEX_COLLECTOR_OVERLAY = new OrientedOverlayRenderer("machines/latex_collector");
    public static final OrientedOverlayRenderer ROASTER_OVERLAY = new OrientedOverlayRenderer("machines/roaster");
    public static final OrientedOverlayRenderer MIXER_OVERLAY_STEAM = new OrientedOverlayRenderer("machines/mixer_steam");
    public static final OrientedOverlayRenderer CONTINUOUS_STIRRED_TANK_REACTOR_OVERLAY = new OrientedOverlayRenderer("machines/continuous_stirred_tank_reactor");
    public static final OrientedOverlayRenderer FIXED_BED_REACTOR_OVERLAY = new OrientedOverlayRenderer("machines/fixed_bed_reactor");
    public static final OrientedOverlayRenderer TRICKLE_BED_REACTOR_OVERLAY = new OrientedOverlayRenderer("machines/trickle_bed_reactor");
    public static final OrientedOverlayRenderer BUBBLE_COLUMN_REACTOR_OVERLAY = new OrientedOverlayRenderer("machines/bubble_column_reactor");
    public static final OrientedOverlayRenderer BATCH_REACTOR_OVERLAY = new OrientedOverlayRenderer("machines/batch_reactor");

    public static final OrientedOverlayRenderer CRYSTALLIZER_OVERLAY = new OrientedOverlayRenderer("machines/crystallizer");
    public static final OrientedOverlayRenderer DRYER_OVERLAY = new OrientedOverlayRenderer("machines/dryer");
    public static final OrientedOverlayRenderer ION_EXCHANGE_COLUMN_OVERLAY = new OrientedOverlayRenderer("machines/ion_exchange_column");
    public static final OrientedOverlayRenderer ZONE_REFINER_OVERLAY = new OrientedOverlayRenderer("machines/zone_refiner");
    public static final OrientedOverlayRenderer TUBE_FURNACE_OVERLAY = new OrientedOverlayRenderer("machines/tube_furnace");

    public static final OrientedOverlayRenderer UV_LIGHT_BOX_OVERLAY = new OrientedOverlayRenderer("machines/uv_light_box");
    public static final OrientedOverlayRenderer CVD_OVERLAY = new OrientedOverlayRenderer("machines/cvd");
    public static final OrientedOverlayRenderer ION_IMPLANTER_OVERLAY = new OrientedOverlayRenderer("machines/ion_implanter");
    public static final SteamTexture INT_CIRCUIT_OVERLAY = SteamTexture.fullImage("textures/gui/progress_bar/int_circuit_overlay_%s.png");
    public static final OrientedOverlayRenderer CATALYTIC_REFORMER_OVERLAY = new OrientedOverlayRenderer("multiblock/catalytic_reformer", FRONT);

    public static final OrientedOverlayRenderer FLUID_COMPRESSOR_OVERLAY = new OrientedOverlayRenderer("machines/fluid_compressor");
    public static final OrientedOverlayRenderer FLUID_DECOMPRESSOR_OVERLAY = new OrientedOverlayRenderer("machines/fluid_decompressor");
}

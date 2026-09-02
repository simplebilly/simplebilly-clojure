(ns simple-billy-api.specs.box-fit
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def box-fit-data
  {
   (ds/req :height_cm) float?
   (ds/req :item_count) int?
   (ds/req :length_cm) float?
   (ds/req :volume_cm3) float?
   (ds/req :width_cm) float?
   })

(def box-fit-spec
  (ds/spec
    {:name ::box-fit
     :spec box-fit-data}))

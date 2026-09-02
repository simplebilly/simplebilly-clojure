(ns simple-billy-api.specs.package
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def package-data
  {
   (ds/opt :description) string?
   (ds/opt :height_cm) float?
   (ds/opt :length_cm) float?
   (ds/opt :reference) string?
   (ds/req :weight_kg) float?
   (ds/opt :width_cm) float?
   })

(def package-spec
  (ds/spec
    {:name ::package
     :spec package-data}))

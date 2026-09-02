(ns simple-billy-api.specs.data-quality
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def data-quality-data
  {
   (ds/req :activity_lines) int?
   (ds/req :activity_share_pct) float?
   (ds/req :spend_lines) int?
   })

(def data-quality-spec
  (ds/spec
    {:name ::data-quality
     :spec data-quality-data}))

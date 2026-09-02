(ns simple-billy-api.specs.quartile-band
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def quartile-band-data
  {
   (ds/req :female_share_pct) float?
   (ds/req :hourly_median) string?
   (ds/req :male_share_pct) float?
   (ds/req :quartile) string?
   })

(def quartile-band-spec
  (ds/spec
    {:name ::quartile-band
     :spec quartile-band-data}))

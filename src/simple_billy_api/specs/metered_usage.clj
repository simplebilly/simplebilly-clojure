(ns simple-billy-api.specs.metered-usage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def metered-usage-data
  {
   (ds/req :limit) int?
   (ds/req :meter) string?
   (ds/req :used) int?
   })

(def metered-usage-spec
  (ds/spec
    {:name ::metered-usage
     :spec metered-usage-data}))

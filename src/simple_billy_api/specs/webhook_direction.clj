(ns simple-billy-api.specs.webhook-direction
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def webhook-direction-data
  {
   })

(def webhook-direction-spec
  (ds/spec
    {:name ::webhook-direction
     :spec webhook-direction-data}))

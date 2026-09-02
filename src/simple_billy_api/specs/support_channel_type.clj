(ns simple-billy-api.specs.support-channel-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def support-channel-type-data
  {
   })

(def support-channel-type-spec
  (ds/spec
    {:name ::support-channel-type
     :spec support-channel-type-data}))

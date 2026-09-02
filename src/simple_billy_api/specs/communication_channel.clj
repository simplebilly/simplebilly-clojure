(ns simple-billy-api.specs.communication-channel
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def communication-channel-data
  {
   })

(def communication-channel-spec
  (ds/spec
    {:name ::communication-channel
     :spec communication-channel-data}))

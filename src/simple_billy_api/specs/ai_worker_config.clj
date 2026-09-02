(ns simple-billy-api.specs.ai-worker-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ai-worker-config-data
  {
   (ds/req :auto_reply) boolean?
   (ds/req :created_at) inst?
   (ds/req :id) uuid?
   (ds/req :is_active) boolean?
   (ds/req :max_tool_calls) int?
   (ds/req :model) string?
   (ds/req :name) string?
   (ds/req :provider) string?
   (ds/req :system_prompt) string?
   (ds/req :tenant_id) uuid?
   (ds/req :trigger_on) (s/coll-of string?)
   (ds/opt :updated_at) inst?
   })

(def ai-worker-config-spec
  (ds/spec
    {:name ::ai-worker-config
     :spec ai-worker-config-data}))
